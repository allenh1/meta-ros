# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Small lib to transform sensor_msgs with tf. Most notably, PointCloud2"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cmake-modules eigen python-orocos-kdl rospy sensor-msgs tf2 tf2-ros"
SRC_URI = "https://github.com/ros-gbp/geometry2-release/archive/release/kinetic/tf2_sensor_msgs/0.5.16-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "da042b602d899ac74b70c30de2c22d5d"
SRC_URI[sha256sum] = "d5687e7dea03350f1ccdf74672f5d60567287d487b9018afba92b3444b8a380a"
S = "${WORKDIR}/geometry2-release-release-kinetic-tf2_sensor_msgs-0.5.16-0"

inherit catkin
