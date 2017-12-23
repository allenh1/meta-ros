# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot core test package includes a node for testing denso robot core n"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "actionlib bcap-core catkin-native denso-robot-core roscpp std-msgs"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_core_test/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f5eea0b6eb113f9baa9e7a29193fa2b4"
SRC_URI[sha256sum] = "7b80ad858e1a0e602e9eba2276683959afded21bc6a097138d5fb9f3870c3f04"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_core_test-3.0.2-0"

inherit catkin
