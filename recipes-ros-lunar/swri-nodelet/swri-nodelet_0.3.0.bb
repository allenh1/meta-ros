# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides a simple script to write simple launch files     that can "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin nodelet rosbash roscpp std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_nodelet/0.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f97621692b292935525cedbbea94c81e"
SRC_URI[sha256sum] = "9c33dd8c9e16b18468e3103c99f2e5b45be7228ec780aa83161ceaf8e78defc3"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_nodelet-0.3.0-0"

inherit catkin
