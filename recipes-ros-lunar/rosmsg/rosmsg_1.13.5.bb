# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosmsg contains two command-line tools:  and     .  is a command-line tool for  "
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native genmsg genpy python-rospkg rosbag roslib"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/${PN}/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "03c05f027fd89980887b3e4007b4b8c9"
SRC_URI[sha256sum] = "d27c0da9872d1d147761991b89ec94dbc27c55298ea8789724bfafdc11276e9d"
S = "${WORKDIR}/ros_comm-release-release-lunar-${PN}-1.13.5-0"

inherit catkin
