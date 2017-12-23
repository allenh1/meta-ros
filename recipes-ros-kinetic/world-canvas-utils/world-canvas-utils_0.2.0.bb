# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++/Python utilities library for the world canvas framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roslib rospy world-canvas-msgs"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas_libs-release/archive/release/kinetic/world_canvas_utils/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "41a671ebb07077c0b931a79bcce2fe16"
SRC_URI[sha256sum] = "9ae9e3df425e916619c9a8ce84443ff7d995be066268042fd1435d577f574e1f"
S = "${WORKDIR}/world_canvas_libs-release-release-kinetic-world_canvas_utils-0.2.0-0"

inherit catkin
