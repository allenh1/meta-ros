# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "ROS message definitions for Velodyne 3D LIDARs."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/ros-drivers-gbp/velodyne-release/archive/release/kinetic/velodyne_msgs/1.3.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1274de3b061bd22a880ea9917b9f4fae"
SRC_URI[sha256sum] = "50a42c7712b5ebd3f179a6a6c278c2dc2960ca8e37861c1a43a6ce45757bd371"
S = "${WORKDIR}/velodyne-release-release-kinetic-velodyne_msgs-1.3.0-0"

inherit catkin
