# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "velocity_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/velocity_controllers/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b88e4a9a9cda2f53d3fd476d153e9296"
SRC_URI[sha256sum] = "457c2818b6ec5473cd4a2ff8adb29487c71fd792caec3f285ee906e2f0f9d6f2"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-velocity_controllers-0.13.2-0"

inherit catkin
