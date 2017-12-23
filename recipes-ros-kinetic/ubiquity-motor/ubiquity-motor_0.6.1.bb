# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provides a ROS interface to Ubiquity Robotics Magni motor controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager diff-drive-controller dynamic-reconfigure geometry-msgs hardware-interface joint-state-controller nav-msgs roscpp serial tf"
SRC_URI = "https://github.com/UbiquityRobotics-release/ubiquity_motor-release/archive/release/kinetic/ubiquity_motor/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f1895374b12bbe3dc3ebe82c882ebd6a"
SRC_URI[sha256sum] = "7709b9483be7d0a38874f771a9327f689ec6612a4e4407a1b9f61a01e93b87d3"
S = "${WORKDIR}/ubiquity_motor-release-release-kinetic-ubiquity_motor-0.6.1-0"

inherit catkin
