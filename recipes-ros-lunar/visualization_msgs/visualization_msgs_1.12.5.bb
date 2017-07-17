# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "visualization_msgs is a set of messages used by higher level packages, such as ,"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=d7b48c8b5ac242f559433598d344f690"

DEPENDS = "catkin geometry_msgs message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/visualization_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76f54cf051ee593191420462e8e6c418"
SRC_URI[sha256sum] = "62b1a7b3e7e2e764d86755913b025cd14ca269afd18320c095dacb2f03dfb340"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
