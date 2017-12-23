# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for a differential drive mobile base."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface nav-msgs realtime-tools tf urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/kinetic/diff_drive_controller/0.13.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3f333cafe823394a3c95f9dbb0dba8e3"
SRC_URI[sha256sum] = "2bd04cb279f34a6d9433b24616293474007c8793e314327ec609193bac131023"
S = "${WORKDIR}/ros_controllers-release-release-kinetic-diff_drive_controller-0.13.2-0"

inherit catkin
