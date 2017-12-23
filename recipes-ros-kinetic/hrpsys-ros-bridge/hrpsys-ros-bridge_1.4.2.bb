# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "hrpsys_ros_bridge package provides basic functionalities to bind   	, a    	-bas"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib angles camera-info-manager catkin-native collada-urdf control-msgs diagnostic-aggregator diagnostic-msgs dynamic-reconfigure euscollada geometry-msgs git hostname hrpsys hrpsys-tools image-transport ipython message-generation mk nav-msgs net-tools pkgconfig pr2-msgs procps python-psutil python-rosdep robot-pose-ekf robot-state-publisher rosbuild roscpp roslang rosnode rostest rqt-gui rqt-gui-py rqt-robot-dashboard rqt-robot-monitor rtmbuild sensor-msgs subversion tf visualization-msgs"
SRC_URI = "https://github.com/tork-a/rtmros_common-release/archive/release/kinetic/hrpsys_ros_bridge/1.4.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3bad0e6677dc29c36baa18806097d1da"
SRC_URI[sha256sum] = "5fc34e800e09ca71d1e2613d972034ef0507d7b1bd0713aadc46e9bb02660eca"
S = "${WORKDIR}/rtmros_common-release-release-kinetic-hrpsys_ros_bridge-1.4.2-0"

inherit catkin
