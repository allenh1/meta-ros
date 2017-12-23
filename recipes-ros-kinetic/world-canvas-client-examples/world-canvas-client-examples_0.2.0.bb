# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Examples showing how to use C++ and Python client libraries to access semantic  "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native nav-msgs roscpp unique-id uuid-msgs world-canvas-client-cpp world-canvas-client-py world-canvas-msgs yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/world_canvas_libs-release/archive/release/kinetic/world_canvas_client_examples/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "765255c0f26504810713c853d3db8de2"
SRC_URI[sha256sum] = "60e0e0cb674e7847d4839ecc04f037597deb885e3c49b265f00e924efe898cc8"
S = "${WORKDIR}/world_canvas_libs-release-release-kinetic-world_canvas_client_examples-0.2.0-0"

inherit catkin
