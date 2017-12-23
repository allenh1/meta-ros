# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Ros extensions and behaviours for py_trees."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs catkin-native dynamic-reconfigure geometry-msgs move-base-msgs nav-msgs py-trees py-trees-msgs python-rospkg python-setuptools python-termcolor rosbag rospy sensor-msgs std-msgs unique-id uuid-msgs"
SRC_URI = "https://github.com/stonier/py_trees_ros-release/archive/release/kinetic/py_trees_ros/0.5.13-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "530c768a06e72836b0bad5a354906701"
SRC_URI[sha256sum] = "349bdb7567d6812fa2c0bbc82fd905cd13b491e0a2a277fdc94b8ab7662be85b"
S = "${WORKDIR}/py_trees_ros-release-release-kinetic-py_trees_ros-0.5.13-0"

inherit catkin
