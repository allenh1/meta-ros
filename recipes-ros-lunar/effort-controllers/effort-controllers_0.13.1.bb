# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "effort_controllers"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles catkin-native catkin control-msgs control-toolbox controller-interface forward-command-controller realtime-tools urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/effort_controllers/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b528377a038ace86c2b522233ced5512"
SRC_URI[sha256sum] = "072120446ece82a72da145b26abba7fbe6fc872880ec566ef03158ef22e6004d"
S = "${WORKDIR}/ros_controllers-release-release-lunar-effort_controllers-0.13.1-0"

inherit catkin
