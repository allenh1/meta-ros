# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "LGPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=c8282549a849842b617e1a1f9f447790"

DEPENDS = "binutils catkin libqt5-svg-dev qtbase5-dev ros-type-introspection rosbag rosbag-storage roscpp roscpp-serialization rostime topic-tools"
SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/lunar/plotjuggler/1.1.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fc58157c949e753f92d5982914009810"
SRC_URI[sha256sum] = "56363f87f67b614f83a58e1f450a9054341236956e420f6ad46b47df0eefc5b6"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
