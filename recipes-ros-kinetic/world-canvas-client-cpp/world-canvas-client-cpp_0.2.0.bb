# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ client library to access semantic maps within the world canvas framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native roscpp unique-id uuid-msgs visualization-msgs world-canvas-msgs"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas_libs-release/archive/release/kinetic/world_canvas_client_cpp/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a716d0913dac1c8c7b30796ed15c1e57"
SRC_URI[sha256sum] = "48ec132d6480d248330389682060c48d798a3592f9fccd77941d80a0011d90d2"
S = "${WORKDIR}/world_canvas_libs-release-release-kinetic-world_canvas_client_cpp-0.2.0-0"

inherit catkin
