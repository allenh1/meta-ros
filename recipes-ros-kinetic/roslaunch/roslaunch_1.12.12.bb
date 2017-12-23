# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS  locally and remotely     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-paramiko python-rospkg python-pyyaml rosclean rosgraph-msgs roslib rosmaster rosout rosparam rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/${PN}/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "37a92484b6c3d96ea9693b9fd3e96b8f"
SRC_URI[sha256sum] = "dac78608867e594812ccb0575094eeeb5828bb1889f7aba97860724965fc1ab8"
S = "${WORKDIR}/ros_comm-release-release-kinetic-${PN}-1.12.12-0"

inherit catkin
