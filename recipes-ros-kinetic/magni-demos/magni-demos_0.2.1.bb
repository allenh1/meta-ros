# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The magni_demos package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native magni-bringup magni-nav magni-teleop rosbridge-server tf2-web-republisher"
SRC_URI = "https://github.com/UbiquityRobotics-release/magni_robot-release/archive/release/kinetic/magni_demos/0.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dfc305e061f4dbf2619a9d472bad1bd4"
SRC_URI[sha256sum] = "985c53884bcc22f4fd536d5d8a570113720b523a132125e6372c6c0be2fdcb1e"
S = "${WORKDIR}/magni_robot-release-release-kinetic-magni_demos-0.2.1-0"

inherit catkin
