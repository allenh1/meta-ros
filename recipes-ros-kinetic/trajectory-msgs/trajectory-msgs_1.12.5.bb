# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package defines messages for defining robot trajectories. These messages ar"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime rosbag-migration-rule std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/kinetic/trajectory_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6d1d8f22f78706c41adb2005226d46f0"
SRC_URI[sha256sum] = "77bd10ccb752011c27c31647a847432616ff3be60e334ff8f4e1dbaaed3cdc20"
S = "${WORKDIR}/common_msgs-release-release-kinetic-trajectory_msgs-1.12.5-0"

inherit catkin
