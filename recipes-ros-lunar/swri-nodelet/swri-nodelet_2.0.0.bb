# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a simple script to write simple launch files     that can "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nodelet rosbash roscpp std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_nodelet/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ccb84e545ae61d2e339768a02766c325"
SRC_URI[sha256sum] = "2fa06e2c59b579b696a7ac019642cfefc16ddaccbfb225482c15df21d27c75f3"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_nodelet-2.0.0-0"

inherit catkin
