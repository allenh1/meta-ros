# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_runtime_monitor provides a GUI plugin viewing DiagnosticsArray messages."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=3237c10cf1c7957044e56e3c371e92ff"

DEPENDS = "catkin diagnostic_msgs python-rospkg python_qt_binding qt_gui rospy rqt_gui rqt_gui_py"
SRC_URI = "https://github.com/ros-gbp/rqt_runtime_monitor-release/archive/release/lunar/rqt_runtime_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1d5968b1c83c51dbccc53d035ef8715f"
SRC_URI[sha256sum] = "e910c184224a8e1ca1bb1dfe54b07c4f366e7e54db5cf5b40243a29528695b62"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
