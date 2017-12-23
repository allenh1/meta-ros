# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The manipulator_h_gui package     This package provides simple GUI to control RO"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen-conversions geometry-msgs libqt4-dev manipulator-h-base-module-msgs qt-build robotis-controller-msgs roscpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-MANIPULATOR-H-release/archive/release/kinetic/manipulator_h_gui/0.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9aba9755760caa492d4afdc0fdf7bd44"
SRC_URI[sha256sum] = "a42fbee38d54c3fd4c90b2ed3153e38a619ca1b5a9a428abf88502ca581508f8"
S = "${WORKDIR}/ROBOTIS-MANIPULATOR-H-release-release-kinetic-manipulator_h_gui-0.2.3-0"

inherit catkin
