# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for a four wheel steering mobile base."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface four-wheel-steering-msgs nav-msgs realtime-tools tf urdf-geometry-parser"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/four_wheel_steering_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "792dd5897df7f0e0127682fb8d38d75e"
SRC_URI[sha256sum] = "b32c23b8d60f1ed99e11fab31c684ea398c48d44da41f2480d05b2e5c06e289c"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-four_wheel_steering_controller-0.13.2-0"

inherit catkin
