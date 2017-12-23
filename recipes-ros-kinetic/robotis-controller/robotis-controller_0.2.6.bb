# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The main package that controls THORMANG3."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules dynamixel-sdk robotis-controller-msgs robotis-device robotis-framework-common roscpp roslib sensor-msgs std-msgs yaml-cpp"
SRC_URI = "https://github.com/ROBOTIS-GIT-release/ROBOTIS-Framework-release/archive/release/kinetic/robotis_controller/0.2.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "dc9d892a83d6551df484bc0160042120"
SRC_URI[sha256sum] = "63a64ac96a68af3b772244f2fa6716d018fe1ec1ae016684753f2b86301d8801"
S = "${WORKDIR}/ROBOTIS-Framework-release-release-kinetic-robotis_controller-0.2.6-0"

inherit catkin
