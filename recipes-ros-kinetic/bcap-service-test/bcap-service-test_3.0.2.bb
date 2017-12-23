# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The bcap service test package includes a node for testing bcap service node."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "bcap-service catkin-native roscpp"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/bcap_service_test/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "081147bbb7b13116e886c3af4bc36837"
SRC_URI[sha256sum] = "913494ed7af481dfe28e04363c780a4702a8556638f7028bcdbd3192b189517f"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-bcap_service_test-3.0.2-0"

inherit catkin
