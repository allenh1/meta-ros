# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The rb1_base_gazebo package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-ros gazebo-ros-control rb1-base-control rb1-base-description rb1-base-pad std-msgs std-srvs tf"
SRC_URI = "https://github.com/RobotnikAutomation/rb1_base_sim-release/archive/release/kinetic/rb1_base_gazebo/1.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1aaf9c7f4721b9c36dd42657df35c2e3"
SRC_URI[sha256sum] = "f2874fcfc9c10fc5ad8d458b5c62a0211c47e0ffdd18660c4af63e4e54784d3c"
S = "${WORKDIR}/rb1_base_sim-release-release-kinetic-rb1_base_gazebo-1.0.2-0"

inherit catkin
