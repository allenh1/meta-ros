# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rqt_plot provides a GUI plugin visualizing numeric values in a 2D plot using dif"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-matplotlib python-numpy python-rospkg python-qt-binding qt-gui-py-common qwt-dependency rosgraph rostopic rqt-gui rqt-gui-py rqt-py-common std-msgs"
SRC_URI = "https://github.com/ros-gbp/rqt_plot-release/archive/release/lunar/rqt_plot/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ef27f8be29aaeedecc97550783d761b0"
SRC_URI[sha256sum] = "ccf117e06d080f1f11bcd66bdfab0f4a7763d92160352d5473509bb0c090016e"
S = "${WORKDIR}/rqt_plot-release-release-lunar-rqt_plot-0.4.8-0"

inherit catkin
