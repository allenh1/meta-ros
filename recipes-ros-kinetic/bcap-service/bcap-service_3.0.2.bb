# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bcap service package includes a node for communicating ORiN from ROS."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "bcap-core catkin-native message-generation message-runtime roscpp std-msgs"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/bcap_service/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1c1e6e1a515259c8081c6b4375a8263c"
SRC_URI[sha256sum] = "0691ff83ec512ac091418e458d54ac3b59323cac1aa6bbb586a7ead0ced2527f"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-bcap_service-3.0.2-0"

inherit catkin
