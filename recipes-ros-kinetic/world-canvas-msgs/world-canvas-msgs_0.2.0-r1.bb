# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "World canvas framework messages package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs std-srvs uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas_msgs-release/archive/release/kinetic/world_canvas_msgs/0.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b86bd4ea2c6e9e51df34a7b81b45a9e8"
SRC_URI[sha256sum] = "6686832e89831aba0a5ed492d94f3d7fd36481ca58e55b52ce686220fa030afc"
S = "${WORKDIR}/world_canvas_msgs-release-release-kinetic-world_canvas_msgs-0.2.0-1"

inherit catkin
