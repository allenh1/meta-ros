# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "effort_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/effort_controllers/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "80d93abd87aad7b36358aee1d8e22c6e"
SRC_URI[sha256sum] = "afa702e7e9f66bee58382d6cfcd09959413d4eef489d4de9a8159caa0c4d30e3"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-effort_controllers-0.13.2-0"

inherit catkin
