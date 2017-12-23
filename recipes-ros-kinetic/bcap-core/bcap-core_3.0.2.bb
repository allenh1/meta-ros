# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bcap core package includes libraries for communicating ORiN via b-CAP (Binar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/bcap_core/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2346222963527d565bc945cf2a0bea36"
SRC_URI[sha256sum] = "4c7822f05617ab7ff396ad27da096e879c778397248f00d50ef3fdc1fa5c7ba9"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-bcap_core-3.0.2-0"

inherit catkin
