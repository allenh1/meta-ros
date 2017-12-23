# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_description package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native robot-state-publisher robotnik-sensors roslaunch urdf xacro"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_common-release/archive/release/kinetic/rb1_base_description/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "581181f6904b62cb7f70f33a50eb1b81"
SRC_URI[sha256sum] = "0a253a76260528c5e2d31d1664250bd5aa267c0085af3ed4d91b143cf5afbb09"
S = "${WORKDIR}/rb1_base_common-release-release-kinetic-rb1_base_description-1.1.0-0"

inherit catkin
