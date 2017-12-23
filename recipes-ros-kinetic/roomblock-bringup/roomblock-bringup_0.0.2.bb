# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The roomblock_bringup package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-manager create-node image-transport joy python-serial robot-pose-ekf robot-state-publisher roomblock-description rplidar-ros rviz teleop-twist-joy"
SRC_URI = "https://github.com/tork-a/roomblock-release/archive/release/kinetic/roomblock_bringup/0.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1e4f7ced58d46ad1678b9f3acd0cd280"
SRC_URI[sha256sum] = "cc9097d46b07fa2754b52e94eeb968a7eccd8b2c58b9536bdad2d0716e1b831b"
S = "${WORKDIR}/roomblock-release-release-kinetic-roomblock_bringup-0.0.2-0"

inherit catkin
