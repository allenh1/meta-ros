# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "roslaunch is a tool for easily launching multiple ROS  locally and remotely
    "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin python-paramiko python-rospkg python-yaml rosclean rosgraph_msgs roslib rosmaster rosout rosparam rosunit"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roslaunch/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7d99db22948f00746830a918931e0194"
SRC_URI[sha256sum] = "cef63ddb2aefa00bb619090f3ec62c5f410c5dae453aa817f24513b13af86caf"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
