# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=8;endline=8;md5=c8282549a849842b617e1a1f9f447790"

DEPENDS = "binutils catkin libqt5-svg-dev qtbase5-dev ros_type_introspection rosbag rosbag_storage roscpp roscpp_serialization rostime topic_tools"
SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/lunar/plotjuggler/1.1.1-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5bc3da785097e478967091b5d108b1cc"
SRC_URI[sha256sum] = "da88977c4492dfc83f9a7ab9f4698f2e9d7308f3cb0fb649d6d6ab6c2eb627bb"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
