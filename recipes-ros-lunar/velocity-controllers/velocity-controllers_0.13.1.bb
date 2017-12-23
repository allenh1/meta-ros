# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "velocity_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/velocity_controllers/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0853c51ef4975be211526f8ea7c3be97"
SRC_URI[sha256sum] = "0c6bd7d3a100e4aa0536898c23af3ac18e9b734aa31c2559911a2cdd148b674b"
S = "${WORKDIR}/ros_controllers-release-release-lunar-velocity_controllers-0.13.1-0"

inherit catkin
