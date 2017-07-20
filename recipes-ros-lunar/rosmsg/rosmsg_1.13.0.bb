# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosmsg contains two command-line tools:  and     .  is a command-line tool for  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin genmsg python-rospkg rosbag roslib"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosmsg/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4385a7b586eaf84b694cbbe2bce271e9"
SRC_URI[sha256sum] = "b9b4d9d280df76027251220fab15b39375538005c3399a09acda81e10b8c9653"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
