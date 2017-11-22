# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS  locally and remotely     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin python-paramiko python-rospkg python-pyyaml rosclean rosgraph-msgs roslib rosmaster rosout rosparam rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roslaunch/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f0f6b7997470c557cf714e64013b769b"
SRC_URI[sha256sum] = "9c67bf2fe56a3e5c20d864140be03e293b9375ef826c5c31049fc9832d3f6e67"
S = "${WORKDIR}/ros_comm-release-release-lunar-roslaunch-1.13.5-0"

inherit catkin
