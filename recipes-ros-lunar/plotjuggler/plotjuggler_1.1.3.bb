# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "binutils catkin libqt5-svg-dev qtbase5-dev ros_type_introspection rosbag rosbag_storage roscpp roscpp_serialization rostime topic_tools"
SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/lunar/plotjuggler/1.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc58157c949e753f92d5982914009810"
SRC_URI[sha256sum] = "56363f87f67b614f83a58e1f450a9054341236956e420f6ad46b47df0eefc5b6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
