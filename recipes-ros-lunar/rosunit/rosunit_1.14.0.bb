# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Unit-testing package for ROS. This is a lower-level library for rostest and hand"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "catkin python-rospkg roslib"
SRC_URI = "https://github.com/ros-gbp/ros-release/archive/release/lunar/rosunit/1.14.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "117b4f069f14a852d67ea348e2baa43a"
SRC_URI[sha256sum] = "ef900a068ff8cddd3b4cd3a52b936e191b6c8ff49716be0e8529ff4ffb6b3d68"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
