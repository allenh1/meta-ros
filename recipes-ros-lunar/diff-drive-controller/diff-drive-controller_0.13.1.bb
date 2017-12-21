# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Controller for a differential drive mobile base."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface nav-msgs realtime-tools tf urdf"
SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/lunar/diff_drive_controller/0.13.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "fb12049512abb912985d1fc483ad7169"
SRC_URI[sha256sum] = "d4da09ca15af82de3dd974a8ddfc3d8f03cc0847b530defa1172ab21291e3dea"
S = "${WORKDIR}/ros_controllers-release-release-lunar-diff_drive_controller-0.13.1-0"

inherit catkin
