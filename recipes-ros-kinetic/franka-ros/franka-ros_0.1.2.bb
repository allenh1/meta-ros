# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "franka_ros is a metapackage for all Franka Emika ROS packages"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "catkin-native franka-control franka-description franka-example-controllers franka-gripper franka-hw franka-msgs franka-visualization panda-moveit-config"
SRC_URI = "https://github.com/frankaemika/franka_ros-release/archive/release/kinetic/franka_ros/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1134bb0283763d858520cb4defab35ed"
SRC_URI[sha256sum] = "55b8cd17f367c3a953023faf3c4d260e5ca6ff5e103eb86d7a7d08cccb455b04"
S = "${WORKDIR}/franka_ros-release-release-kinetic-franka_ros-0.1.2-0"

inherit catkin
