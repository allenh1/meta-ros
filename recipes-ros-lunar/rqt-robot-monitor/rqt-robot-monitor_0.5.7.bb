# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_robot_monitor displays diagnostics_agg topics messages that
   are published"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_msgs python-rospkg python_qt_binding qt_gui qt_gui_py_common rospy rqt_bag rqt_gui rqt_gui_py rqt_py_common"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_monitor-release/archive/release/lunar/rqt_robot_monitor/0.5.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "735fd28e91f07b9795f55f7f703121a4"
SRC_URI[sha256sum] = "cd2275e762a0d3040912039e66dbd41768834be184e8939d741f80a33ca9f07a"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
