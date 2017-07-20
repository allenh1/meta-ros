# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Standard ROS Messages including common message types representing primitive data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/std_msgs-release/archive/release/lunar/std_msgs/0.5.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ffb1da7c69cfdee74a7c991fa91f6418"
SRC_URI[sha256sum] = "0db7f599d921835e3c0e94846828fa75a50b7eee8f5c14a79c3a918a2d30d004"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
