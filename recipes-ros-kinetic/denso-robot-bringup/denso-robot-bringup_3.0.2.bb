# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The denso robot bringup package includes launch files for starting denso robot n"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "catkin-native"
SRC_URI = "https://github.com/DENSORobot/denso_robot_ros-release/archive/release/kinetic/denso_robot_bringup/3.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2af5e99e41eef2b476da31fb945b9956"
SRC_URI[sha256sum] = "031a4183f379b1f3c9d1f578e813194b859638b17e182d558b65905a5f6d224b"
S = "${WORKDIR}/denso_robot_ros-release-release-kinetic-denso_robot_bringup-3.0.2-0"

inherit catkin
