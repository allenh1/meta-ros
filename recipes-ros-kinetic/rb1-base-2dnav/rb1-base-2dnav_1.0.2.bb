# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package configures the move_base stack and makes use of the gmapping and am"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "amcl catkin-native gmapping map-server message-runtime move-base robot-pose-ekf rviz std-msgs tf"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_sim-release/archive/release/kinetic/rb1_base_2dnav/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d904b5162f2572a256a216c7abcb7eb8"
SRC_URI[sha256sum] = "1fdaf6fd6270eeb53e261d1c45a17c3c16f6fc2897537606cc5ec059de79833b"
S = "${WORKDIR}/rb1_base_sim-release-release-kinetic-rb1_base_2dnav-1.0.2-0"

inherit catkin
