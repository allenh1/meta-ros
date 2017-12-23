# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot control package includes a node for controlling DENSO robot cont"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "bcap-core bcap-service catkin-native controller-manager denso-robot-core hardware-interface joint-limits-interface roscpp std-msgs transmission-interface"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_control/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6940c28eefe029f8a97cd2d04a08d7ef"
SRC_URI[sha256sum] = "6d38c8f0b10e95aa8b2e00ef469570f34e2b91b744c4385b145ffc6ddcd76b7e"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_control-3.0.2-0"

inherit catkin
