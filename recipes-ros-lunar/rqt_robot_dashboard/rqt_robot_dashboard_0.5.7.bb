# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=7;endline=7;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin diagnostic_msgs python_qt_binding qt_gui rospy rqt_console rqt_gui rqt_gui_py rqt_nav_view rqt_robot_monitor"
SRC_URI = "https://github.com/ros-gbp/rqt_robot_dashboard-release/archive/release/lunar/rqt_robot_dashboard/0.5.7-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "6bf2b3a6d42babb183befac1bcad8398"
SRC_URI[sha256sum] = "bd5df61568d54f6ecd2b7826f6ef9f39bae40d53dc9d46c0984ee7eba2e7501f"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
