# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_runtime_monitor provides a GUI plugin viewing DiagnosticsArray messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-rospkg python-qt-binding qt-gui rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_runtime_monitor-release/archive/release/kinetic/rqt_runtime_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1b37482400a16bcbc93fad70f53874dd"
SRC_URI[sha256sum] = "45cf250ce885a50ea9aaa0fc2570ea86493fd642f183476375dc2a9e62b57822"
S = "${WORKDIR}/rqt_runtime_monitor-release-release-kinetic-rqt_runtime_monitor-0.5.7-0"

inherit catkin
