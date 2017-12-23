# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Gazebo simulation for NEXTAGE Open"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native gazebo-plugins gazebo-ros gazebo-ros-control nextage-description nextage-moveit-config ros-controllers"
SRC_URI = "https://github.com/tork-a/rtmros_nextage-release/archive/release/kinetic/nextage_gazebo/0.8.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cc0cb4a865e533628e10db4f07d1e31f"
SRC_URI[sha256sum] = "bed28f3447ad0300c945543f49d9c9f2126545a93ffa676fc2679354920fad8d"
S = "${WORKDIR}/rtmros_nextage-release-release-kinetic-nextage_gazebo-0.8.3-0"

inherit catkin
