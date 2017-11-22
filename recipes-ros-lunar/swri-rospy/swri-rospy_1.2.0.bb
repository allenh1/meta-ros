# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package provides added functionaliy on top of rospy, including a   single-t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin rospy std-msgs std-srvs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_common-release/archive/release/lunar/swri_rospy/1.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ce54e367f5d9d9ce45ad074e8c9f0d17"
SRC_URI[sha256sum] = "0298c8fb42467017f03579a9392467c22aeb54bda1c302a895cfffcab0a3e1b3"
S = "${WORKDIR}/marti_common-release-release-lunar-swri_rospy-1.2.0-0"

inherit catkin
