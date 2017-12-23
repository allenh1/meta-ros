# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot descriptions package includes URDF files for DENSO robots."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_descriptions/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "93f1e9c8a7b66f64d3dfc101ccd5b38c"
SRC_URI[sha256sum] = "ad9661c8fc088234f0165a793865dfec2eb421dcf2c6d48a9825ab4b3b329e77"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_descriptions-3.0.2-0"

inherit catkin
