# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "urdf models converted from euslisp"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native collada-urdf gazebo-ros python-lxml roseus rostest"
SRC_URI = "https://github.com/tork-a/jsk_model_tools-release/archive/release/kinetic/${PN}/0.3.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "204ee0d308efdd0ef47198c0bb7bd890"
SRC_URI[sha256sum] = "c0711370b5768bf0821f30a124fd6fa0d4e1332d25343386bc0fd5a121e6ad0c"
S = "${WORKDIR}/jsk_model_tools-release-release-kinetic-${PN}-0.3.5-0"

inherit catkin
