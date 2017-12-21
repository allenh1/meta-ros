# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_runtime_monitor provides a GUI plugin viewing DiagnosticsArray messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native diagnostic-msgs python-rospkg python-qt-binding qt-gui rospy rqt-gui rqt-gui-py"
SRC_URI = "https://github.com/ros-gbp/rqt_runtime_monitor-release/archive/release/lunar/rqt_runtime_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d5968b1c83c51dbccc53d035ef8715f"
SRC_URI[sha256sum] = "e910c184224a8e1ca1bb1dfe54b07c4f366e7e54db5cf5b40243a29528695b62"
S = "${WORKDIR}/rqt_runtime_monitor-release-release-lunar-rqt_runtime_monitor-0.5.7-0"

inherit catkin
