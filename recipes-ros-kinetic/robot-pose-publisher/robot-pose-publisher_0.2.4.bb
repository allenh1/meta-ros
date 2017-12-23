# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Simple Node to Publish the Robot's Position Relative to the Map using TFs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp tf"
SRC_URI = "https://github.com/gt-rail-release/robot_pose_publisher-release/archive/release/kinetic/robot_pose_publisher/0.2.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6b1b002255ba7a31ab5d2e49dd7bc0e1"
SRC_URI[sha256sum] = "f9d05e9dcd841a192caf488678928ffda8553134d3d7335fc2a3a05ee52b7b9e"
S = "${WORKDIR}/robot_pose_publisher-release-release-kinetic-robot_pose_publisher-0.2.4-0"

inherit catkin
